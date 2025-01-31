package com.example.trying.store;


import com.example.trying.stock.Stock;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    @JsonIgnore
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<Stock> stocks;


}
