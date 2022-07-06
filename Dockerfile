FROM python: 3.7

RUN mkdir /opt/app
WORKDIR /opt/app

COPY hello.py /opt/app

CMD ["python", "hello.py"] 
