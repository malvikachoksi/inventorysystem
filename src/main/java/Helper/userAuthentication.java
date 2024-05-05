/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import javax.security.enterprise.authentication.mechanism.http.CustomFormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;

/**
 *
 * @author hp
 */
@CustomFormAuthenticationMechanismDefinition(
        loginToContinue = @LoginToContinue(
        loginPage = "/Login.jsf"
        )
)

@DatabaseIdentityStoreDefinition(
dataSourceLookup = "java/project",
        callerQuery = "select password from usertb where username = ?",
        groupsQuery = "select groupname from grouptb where username=?",
            hashAlgorithm = Pbkdf2PasswordHash.class,
        priority = 30)


public class userAuthentication {
    
}
