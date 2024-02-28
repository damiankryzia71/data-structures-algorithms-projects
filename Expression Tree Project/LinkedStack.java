// 
//  Name:     Kryzia, Damian 
//  Project:  4 
//  Due:      12/02/2022 
//  Course:   cs-2400-02-f22 
// 
//  Description: 
//            This genereic LinkedStack class is an implementation of the
//            Stack interface, therefore the stack data structure. It uses
//            a singly-linked list of nodes to store and manipulate data.
//            It uses methods from the Stack interface, as well as a private
//            Node class.
// 

/**
 * The generic class LinkedStack is an implementation of the stack data type.
 * It is a singly-linked list implementation of the Stack interface.
 */
public class LinkedStack<T> implements Stack<T> {

    private Node firstNode;
    
    /**
     * Constructs an empty stack.
     */
    public LinkedStack()
    {
        firstNode = null;
    }

    /**
     * Adds a specified entry to the top of the stack.
     * @param newEntry A new entry to be added to the stack.
     */
    public void push(T newEntry)
    {
        Node newNode = new Node(newEntry, firstNode);
        firstNode = newNode;
    }
    
    /**
     * Removes an entry from the top of the stack.
     * @return The removed entry.
     * @throws RuntimeException If the stack is empty.
     */
    public T pop()
    {
        if (firstNode == null)
        {
            throw new RuntimeException("Stack: pop(): Stack is empty.");
        }
        else
        {
            T toRemove = firstNode.data;
            firstNode = firstNode.next;
            return toRemove;
        }
    }

    /**
     * Returns the entry that is on top of the stack without
     * affecting the stack itself.
     * @return The entry that is currently on top of the stack.
     * @throws RuntimeException If the stack is empty.
     */
    public T peek()
    {
        if (firstNode == null)
        {
            throw new RuntimeException("Stack: peek(): Stack is empty.");
        }
        else
        {
            return firstNode.data;
        }
    }

    /**
     * Checks whether the stack is empty.
     * @return True if the stack is empty, false otherwise.
     */
    public boolean isEmpty()
    {
        return (firstNode == null);
    }

    /**
     * Clears the stack.
     */
    public void clear()
    {
        while (!isEmpty())
        {
            pop();
        }
    }

    private class Node
    {
    
        private T data;

        private Node next;

        private Node(T dataPortion)
        {
            this(dataPortion, null);
        }

        private Node(T dataPortion, Node nextNode)
        {
            data = dataPortion;
            next = nextNode;
        }
    }

}