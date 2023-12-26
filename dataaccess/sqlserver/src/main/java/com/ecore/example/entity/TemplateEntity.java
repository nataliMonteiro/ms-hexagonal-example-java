package com.ecore.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tabela")
public class TemplateEntity {

    @Id
    @Column(name = "id_tabela")
    private Long id;
}
