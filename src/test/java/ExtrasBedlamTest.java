import org.junit.jupiter.api.Test;
import product.Extra;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ExtrasBedlamTest {
    @Test
    void extraCostDependsName() {
        assertThat(new Extra("Básicos").getPrice(), equalTo(0.90));
        assertThat(new Extra("Gourmet").getPrice(), equalTo(1.20));
        assertThat(new Extra("Premium").getPrice(), equalTo(2.20));
        assertThat(new Extra("Salsa barbacoa").getPrice(), equalTo(1.00));
        assertThat(new Extra("Salsa picante").getPrice(), equalTo(0.90));
        assertThat(new Extra("Borde relleno de queso").getPrice(), equalTo(1.20));
    }
}

