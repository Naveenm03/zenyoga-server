// package com.zenyoga.madhumitha.enumerated;

// public enum Role {
//     USER,ADMIN;
// }
package com.zenyoga.naveen.enumerated;
import static com.zenyoga.naveen.enumerated.Permission.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {
    ADMIN(
            Set.of(
                    ADMIN_READ,
                    ADMIN_UPDATE,
                    ADMIN_DELETE,
                    ADMIN_CREATE,
                    USER_READ,
                    USER_UPDATE,
                    USER_DELETE,
                    USER_CREATE)),
    USER(
            Set.of(
                    USER_READ,
                    USER_UPDATE,
                    USER_DELETE,
                    USER_CREATE));

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}