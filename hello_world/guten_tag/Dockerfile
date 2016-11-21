FROM golang:1.6-alpine

COPY . /app
WORKDIR /app
RUN go build guten_tag.go

EXPOSE  8080
CMD ["guten_tag"]
