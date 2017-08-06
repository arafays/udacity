# "Database code" for the DB Forum.

import psycopg2, bleach

def get_posts():
  """Return all posts from the 'database', most recent first."""
  db = psycopg2.connect(database = "forum")
  c = db.cursor()
  c.execute("select content, time from posts order by time desc")
  p = c.fetchall()
  db.close()
  return p

def add_post(content):
  """Add a post to the 'database' with the current timestamp."""
  db = psycopg2.connect(database = "forum")
  c = db.cursor()
  content = bleach.clean(content)
  c.execute("insert into posts (content) values ( %s )", (content,) )
  db.commit()
  db.close()


