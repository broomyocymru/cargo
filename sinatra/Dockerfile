FROM ruby:latest

MAINTAINER broomyocymru "https://github.com/broomyocymru"

COPY . /app
WORKDIR /app
RUN cd /app; bundle install

ENV custom_background_colour red
ENV custom_foreground_colour black

EXPOSE 5000
CMD ["bundle", "exec", "rackup", "--host", "0.0.0.0", "-p", "5000"]