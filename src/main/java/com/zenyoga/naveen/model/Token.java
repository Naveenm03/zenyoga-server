package com.zenyoga.naveen.model;

import static com.zenyoga.naveen.enumerated.TokenType.*;
import static jakarta.persistence.EnumType.*;
import static jakarta.persistence.GenerationType.*;

import com.zenyoga.naveen.enumerated.TokenType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_token")
public class Token {
    @Id
    @GeneratedValue(strategy = UUID)
    public String id;

    @Column(unique = true)
    public String token;

    @Builder.Default
    @Enumerated(STRING)
    public TokenType tokenType = BEARER;

    public boolean revoked;

    public boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User user;
}