# springsecurity
Spring security was implemented by OAUTH2 and Angularjs1

Spring Authorizatrion

- config

  -> AuthorizationServerConfig
  
  Config Datasource which, keep token 
  
  -> SecurityConfig

  Config security such as user and path permission

- controller

  -> Token/ RevokeController 
  
  Endpoints which, responsible for management token such as get update or delete

- filter

  Config server access control origin of authorization server

Spring UI and Resource

Resource

- config

  -> MethodSecurityConfig
  
  Override GlobalMethodSecurityConfiguration of spring by OAuth2MethodSecurityExpressionHandler
  
  -> ResourceServerConfig
  
  Config Datasource which, keep token 
  
  -> SecurityConfig
  
  Config package's controller which, need security

- controller

  Config endpoints security by annotation @PreAuthorize such as @PreAuthorize("#oauth2.hasScope('bar') and #oauth2.hasScope('read')")
    
- dto

  Data transfer object

- filter

  Config server access control origin of resource server

UI: Usign zuul for filtering request

- config

  -> UiWebConfig

  Config security such as resource and path permission

- filter

  -> CustomHttpServletRequest

  

  -> CustomPostZuulFilter

  Override zuul post filter for keeping cookies when delete and refesh token

  -> CustomPreZuulFilter
  
  Override zuul pre filter for adding the Authorization into request header


Reference code from: http://www.baeldung.com/rest-api-spring-oauth2-angularjs



