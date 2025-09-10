# Comandos ArrayList

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
