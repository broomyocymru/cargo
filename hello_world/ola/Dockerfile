FROM alpine:3.1

# Update
RUN apk add --update python py-pip

COPY . /app
WORKDIR /app
RUN pip install -r requirements.txt

EXPOSE  8080
CMD ["python", "main.py", "-p 8080"]
