# kubernetes-with-spring-boot

<b>Reference :</b>  https://gorillalogic.com/blog/build-and-deploy-a-spring-boot-app-on-kubernetes-minikube/

<br><br>
kubectl basic commands <br>
 - open dashboard : minikube dashboard
 - check cluster info : kubectl cluster-info
 - create kuber deploy : sudo kubectl run {DEPLOY_NAME} --image={DOCKER_IMAGE}:0.0.1-SNAPSHOT --port=8080
 - check container's name : sudo kubectl get deployments
 - check container that running : sudo kubectl get pods
 - Expose port
   1. sudo kubectl expose deployment/{YOUR_CONTAINER_NAME} --type="NodePort" --port 8080
   2. check services info for getting NodePort : kubectl describe services/{YOUR_CONTAINER_NAME}
   3. check ipaddress : minikube ip
   4. access pod runng by use IP from <3> and port = NodePort from <2>
 
 <br>
<b>Spring boot</b><br>
 Library
  - web
  - spring-boot-maven-plugin version : 2.1.1.RELEASE
  - Spotify plugin <dockerfile-maven-plugin> version : 1.4.1
   
