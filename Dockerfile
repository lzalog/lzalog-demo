FROM python:3.9

ONBUILD RUN mkdir /opt/app
ONBUILD WORKDIR /opt/app

ONBUILD COPY hello.py /opt/app

ONBUILD CMD ["python", "hello.py"]

CMD ["echo", "Hello world!"]