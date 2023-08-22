package Algoritms.HomeWork.HW4;

public class RedBlackTree { //Класс, представляющий красно-черное дерево.
    private Node root;

    public boolean add(int value) { //Вставка элемента в дерево.
        if (root != null) { // Если корень дерева не является null. Создаем новый узел с заданным значением и цветом "черный", если корень не null.
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        } else {  //Если дерево пустое, новый узел становится корнем и окрашивается в "черный" цвет.
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private boolean addNode(Node node, int value) { //Рекурсивная функция для вставки узла с заданным значением в дерево.

        if (node.value == value) { //Если значение value уже существует в текущем узле, функция возвращает false, что указывает на то, что вставка не выполнена.
            return false;
        } else {
            if (node.value > value) { //Если значение нового узла меньше значения текущего узла, переходим к левому поддереву.
                if (node.leftChild != null) { //Если у текущего узла уже есть левый потомок, то вызывается рекурсивный вызов addNode для вставки значения в левое поддерево.
                    boolean result = addNode(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                    return result;
                } else { //Если левого поддерева нет, новый узел становится левым потомком текущего узла. Новый узел окрашивается в красный цвет и ему присваивается значение value.
                    node.leftChild = new Node();
                    node.leftChild.color = Color.RED;
                    node.leftChild.value = value;
                    return true;
                }    
            } else {
                if (node.rightChild != null) { // Если значение value больше, чем значение в текущем узле, выполняется ветвь кода для правого поддерева.
                    boolean result = addNode(node.rightChild, value);
                    node.rightChild = rebalance(node.rightChild);
                    return result;    
                   
                } else { //Если правого поддерева нет, новый узел становится правым потомком текущего узла и окрашивается в красный цвет.
                    node.rightChild = new Node();
                    node.rightChild.color = Color.RED;
                    node.rightChild.value = value;
                    return true;
                }
            }
        }
    }

    private Node rebalance(Node node) { //Балансировка, восстановление свойств красно-черного дерева после вставки узла. Она обнаруживает и исправляет нарушения свойств красно-черного дерева.

        Node result = node; //Создается переменная result, которая инициализируется текущим узлом. Это позволяет обновлять текущий узел в процессе балансировки.
        boolean needRebalance; // Флаг, который указывает, нужно ли выполнять дополнительные операции балансировки.
        do {
            needRebalance = false;
            if (result.rightChild != null && result.rightChild.color == Color.RED && // Первое условие проверяет, является ли правый потомок текущего узла красным, а левый потомок — либо черным, либо отсутствующим.
                    (result.leftChild == null || result.leftChild.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED && // Второе условие проверяет, является ли левый потомок текущего узла и его левый потомок красными. Это указывает на нарушение правила "красный потомок имеет черного родителя".
                    result.leftChild.leftChild != null && result.leftChild.leftChild.color == Color.RED) {

                needRebalance = true;
                result = leftSwap(result);
            }

            if (result.leftChild != null && result.leftChild.color == Color.RED && // Третье условие проверяет, являются ли и левый, и правый потомки текущего узла красными. Это нарушает правило "красный узел не имеет красных потомков".
                    result.rightChild != null && result.rightChild.color == Color.RED) {

                needRebalance = true;
                colorSwap(result);
            }
        }
        while (needRebalance);
        return result;

    }

    private Node rightSwap(Node node) { //Правый поворот поддерева относительно заданного узла.

        Node rightChild = node.rightChild;
        Node betweenChild = rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    private Node leftSwap(Node node) { //Левый поворот поддерева относительно заданного узла.

        Node leftChild = node.leftChild;
        Node betweenChild = leftChild.rightChild;
        leftChild.rightChild = node;
        node.leftChild = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;

    }

    private void colorSwap(Node node) { //Функция обмена цветами между узлом и его двумя потомками в красно-черном дереве.

        node.rightChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    private class Node { // Внутренний класс Node, который представляет узел для красно-черного дерева. 
                         // Каждый узел хранит своё значение, цвет и ссылки на левого и правого потомков.
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;

        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", color=" + color +
                    '}';
        }

    }

    private enum Color {
        RED, BLACK
    }
}