FROM alpine:3.1

# Update
RUN apk add --update python py-pip

COPY . /cargo
WORKDIR /cargo
RUN pip install -r requirements.txt

EXPOSE  8000
CMD ["python", "main.py", "-p 8000"]
