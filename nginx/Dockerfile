FROM nginx:alpine
#RUN mkdir -p /var/log/nginx && chown -R nginx:nginx /var/log/nginx
#    # ec2 log 파일 출력하는 거. docker logs 로 볼 수 있어서 안해도 됨.
COPY default.conf /etc/nginx/conf.d/default.conf
COPY load.conf /etc/nginx/conf.d/load.conf