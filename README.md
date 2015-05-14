# play-getting-started

A barebones Play app, which can easily be deployed to Heroku.  

This application support the [Getting Started with Play on Heroku](https://devcenter.heroku.com/articles/getting-started-with-play-on-heroku) article - check it out.

## Running Locally

Make sure you have Play and sbt installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/heroku/play-getting-started.git
$ cd play-getting-started
$ sbt compile stage
$ foreman start web
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Play and Scala on Heroku, see these Dev Center articles:

- [Play and Scala on Heroku](https://devcenter.heroku.com/categories/language-support#scala-and-play)

