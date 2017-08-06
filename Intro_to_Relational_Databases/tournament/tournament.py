
#!/usr/bin/env python
# 
# tournament.py -- implementation of a Swiss-system tournament
#

import psycopg2

def connect():
    """Connect to the PostgreSQL database.  Returns a database connection."""
    return psycopg2.connect("dbname=tournament")


def deleteMatches():
    """Remove all the match records from the database."""
    con = connect()
    c = con.cursor()
    c.execute('''
                        DELETE FROM matches;
                    ''')
    con.commit()
    con.close()


def deletePlayers():
    """Remove all the player records from the database."""
    con = connect()
    c = con.cursor()
    c.execute('''
                        DELETE FROM players;
                    ''')
    con.commit()
    con.close()


def countPlayers():
    """Returns the number of players currently registered."""
    con = connect()
    c = con.cursor()
    c.execute('''
                        SELECT COUNT(id)
                        FROM players;
                    ''')
    playerCount = c.fetchall()[0][0]
    con.close()
    return playerCount


def registerPlayer(name):
    """Adds a player to the tournament database.
  
    The database assigns a unique serial id number for the player.  (This
    should be handled by your SQL database schema, not in your Python code.)
  
    Args:
      name: the player's full name (need not be unique).
    """
    con = connect()
    c = con.cursor()
    c.execute('''
                        INSERT INTO players( name )
                        VALUES( %s );
                    ''', (name,) )
    con.commit()
    con.close()


def playerStandings():
    """Returns a list of the players and their win records, sorted by wins.

    The first entry in the list should be the player in first place, or a player
    tied for first place if there is currently a tie.

    Returns:
      A list of tuples, each of which contains (id, name, wins, matches):
        id: the player's unique id (assigned by the database)
        name: the player's full name (as registered)
        wins: the number of matches the player has won
        matches: the number of matches the player has played
    """
    aTable = []
    con = connect()
    c = con.cursor()
    c.execute('''
                        SELECT
                            players.id AS id,
                            players.name AS name,
                            (
                                SELECT COUNT (matches.winner)
                                FROM matches
                                WHERE players.id = matches.winner
                            ) AS wins,
                            (
                               SELECT COUNT(match_id)/2
                               FROM matches
                            ) AS matches
                        FROM players
                        ORDER BY wins;    
                    ''')
    aTable = c.fetchall()
    con.close()
    return aTable
    

def reportMatch(winner, loser):
    """Records the outcome of a single match between two players.

    Args:
      winner:  the id number of the player who won
      loser:  the id number of the player who lost
    """
    con = connect()
    c = con.cursor()
    c.execute( '''
                        INSERT INTO matches ( winner, losser )
                        VALUES ( %s, %s ) ;
                        ''', ( winner, loser, ) )
    con.commit()
    con.close()
 
 
def swissPairings():
    """Returns a list of pairs of players for the next round of a match.
  
    Assuming that there are an even number of players registered, each player
    appears exactly once in the pairings.  Each player is paired with another
    player with an equal or nearly-equal win record, that is, a player adjacent
    to him or her in the standings.
  
    Returns:
      A list of tuples, each of which contains (id1, name1, id2, name2)
        id1: the first player's unique id
        name1: the first player's name
        id2: the second player's unique id
        name2: the second player's name
    """
    currTable = playerStandings()
    count = int ( countPlayers() )
    pairings = []
    for i in range ( count ) : 
        if ( i%2 == 0 ) : 
            id1 = currTable[i][0]
            name1 = currTable[i][1]
            id2 = currTable[i+1][0]
            name2 = currTable[i+1][1]
            pair = ( id1, name1, id2, name2 )
            pairings.append( pair )
    return pairings
