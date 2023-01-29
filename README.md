# spring-security-oauth-bug

It's repository to reproduce bug with spring-security-oauth. PermitAll routes returns 401 when token's provided, but expired.

### To reproduce bug:

1. Run ```sh keycloak-startup.sh``` to start keycloak server, if you wanna get token from keycloak and check ```BearerTokenAuthenticationFilter```
2. Run application
3. Try to send request from ```auth.http``` file with invalid token
4. You'll get 401
5. Try to send request from ```auth.http``` file without token
6. You'll get 200
