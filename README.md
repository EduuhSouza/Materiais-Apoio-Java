# 📘 Materiais de Apoio - Java  

Este repositório foi criado para reunir exemplos práticos e materiais de apoio em **Java**.  
---

## 🔷 Pilares da Programação Orientada a Objetos (POO)

A Programação Orientada a Objetos é baseada em quatro pilares principais. Abaixo estão descrições diretas e exemplos para cada um deles.

### 🔹 1. Abstração

**Definição:**  
Abstração é o processo de modelar objetos do mundo real em classes, focando apenas nos comportamentos e características essenciais, ocultando detalhes desnecessários.

**Exemplo:**  
A classe `Animal` representa uma abstração genérica com comportamentos comuns. As classes `Gato` e `Cachorro` estendem `Animal` e implementam seus próprios comportamentos específicos.

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/Pilares%20POO/pilares-poo/src/abstracao)

---

### 🔹 2. Encapsulamento

**Definição:**  
Encapsulamento consiste em proteger os dados da classe, permitindo o acesso a eles apenas através de métodos públicos (getters e setters).

**Exemplo:**  
Na classe `ExemplosEncapsulamento`, os atributos `nome` e `idade` são privados, e só podem ser acessados ou modificados por meio de métodos públicos.

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/Pilares%20POO/pilares-poo/src/encapsulamento)


---


### 🔹 3. Herança

**Definição:**  
Herança permite que uma classe herde atributos e métodos de outra, promovendo reuso de código.

**Exemplo:**  
A classe `Funcionario` herda da classe `Pessoa`. Isso significa que `Funcionario` recebe os atributos e métodos de `Pessoa`, além de poder definir seus próprios.

📁 Arquivo: - [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/Pilares%20POO/pilares-poo/src/heranca)

---

### 🔹 4. Polimorfismo

**Definição:**  
Polimorfismo permite que o mesmo método tenha comportamentos diferentes, dependendo do objeto que o invoca.

**Exemplo:**  
O método `falar()` pode ter diferentes implementações em classes como `Cachorro` (latir) e `Gato` (miar).

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/Pilares%20POO/pilares-poo/src/polimorfismo)

---

Classe main dos Pilares da Programação Orientada a Objetos
📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/blob/main/Pilares%20POO/pilares-poo/src/Main.java)

---
> Anotações de Classes

- `abstract`: usada para ocultar detalhes de implementação e expor apenas funcionalidades essenciais.
- `sealed`: só pode ser estendido por suas próprias subclasses explicitamente permitidas.
- `permits`: usada em conjunto com `sealed` e interfaces para definir explicitamente quais classes ou interfaces podem estendê-las ou implementá-las.
- `super`: acionar algum comportamento da classePai.
- `extends`: palavra-chave usada para indicar a herança em Java.
- `@Override`: indica que o método está sendo sobrescrito, assim evitando erros de digitação.

---

###  Pacotes em Java (Packages)  
🔹 Como organizar o código em pacotes.  
🔹 Como **importar** uma ou mais classes de um package para a `Main`.  

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/Package)

---
###  Laços de repetição (POO)
🔹 Exercícios práticos envolvendo:  
- While  
- Switch Case

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/La%C3%A7os%20de%20repeti%C3%A7%C3%A3o) 

---

###  Cálculos Básicos  
🔹 Exemplos de operações matemáticas simples:  
- Multiplicação  
- Divisão  
- Incremento  
- Decremento  

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/C%C3%A1lculos%20Basicos)  

---

###  Números e Cálculos Específicos  
🔹 Exercícios práticos envolvendo:  
- Cálculo do **IMC**  
- Identificação de **números pares e ímpares**  
- Geração de **tabuada**
- Também tem alguns laços de repetição tipo o While, do While, if / else e For

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/N%C3%BAmeros%20e%20C%C3%A1lculos%20Espec%C3%ADficos)  

---

###  Herança e Polimorfismo 
🔹 Exercícios práticos envolvendo:  
- Herança usando o Extends
- Polimorfismo 

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/Heran%C3%A7a%20e%20Polimorfismo/heranca-e-polimorfismo/src)  

---

###  ArrayList 
🔹 Exercícios práticos envolvendo:  
- Criando a primeira lista
- Sobreescrevendo o ToString
- Organizando listas (Crescente e decrescente)
- Utilizando itens de classes na lista

📁 Arquivo:  [Acesse aqui](https://github.com/EduuhSouza/Materiais-Apoio-Java/tree/main/ArrayList)  

 ---

> **COMANDOS ARRAYLIST**

- `nomeVarObj.add(item)` → adiciona item na lista
- `nomeVarObj.remove(item)` → remove item
- `nomeVarObj.size()` → mostra quantos itens tem na lista
- `nomeVarObj.get(numero)` → pega um elemento específico da lista, lembrando que o 0 é o primeiro item
- `nomeVarObj.clear()` → limpa a lista
- `Collections.sort(nomeDaLista)` → ordena em ordem crescente
- `Collections.sort(nomeLista, Collections.reverseOrder())` → ordena em ordem decrescente

- `String[]` → Array fixo
- `new ArrayList<>()` → Array dinâmico

---

> **Tipos primitivos e Wrapper Class**

- `int` → `Integer`
- `float` → `Float`
- `double` → `Double`
- `char` → `Character`

> A **Wrapper Class** é uma forma de representar um tipo primitivo na forma de objeto: classe em forma de objeto.

---

> **Printar todos os itens da lista com o get()**

```java 
for (int i = 0; i < livros.toArray().length; i++){
    System.out.println(livros.get(i));
}

// outra forma de printar usando somente o array dinamico
  for(Produto p : produtos){
          System.out.println(p);
}
```


