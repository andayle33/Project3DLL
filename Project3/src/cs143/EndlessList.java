package cs143;

import java.util.Iterator;

/**
 * This data class represents an ordered collection in an endless circular list.
 *
 * @param <E> the type of values stored in the list
 * @ author Andy Le
 */
public class EndlessList<E> implements Iterable<E> {

    //fields
    private Node cursor;

    /**
     * Adds a value before the current one and moves the cursor to the new
     * value. If the list is empty the value is simply added and becomes the
     * current one.
     *
     * @param value the value to add to the list
     */
    public void addPrev(E value) {
        // TODO write method body //

        if (cursor.getValue() == null) {
            cursor.setValue(value);
            cursor.setNext(cursor);
        } else if (cursor.getPrev() == null) {
            cursor.setPrev(cursor);
            cursor.setValue(value);
        }

    }

    /**
     * Adds a value after the current one and moves the cursor to the new value.
     * If the list is empty the value is simply added and becomes the current
     * one.
     *
     * @param value the value to add to the list
     */
    public void addNext(E value) {
        if (cursor.getValue() == null) {
            cursor.setValue(value);
            cursor.setNext(cursor);
        } else if (cursor.getNext() == null) {
            cursor.setPrev(cursor);
            cursor.setValue(value);
        }

    }

    /**
     * Removes the current value from the list and moves the cursor to the next
     * value, returning the removed value. Returns a null if the list is empty.
     * If this is the last value in the list the cursor becomes null.
     *
     * @return the value removed
     */
    public E remove() {
        E temp = null;
        if (cursor.equals(null)) {
            return null;
        } else if (cursor.getNext() == null) {
            cursor = null;
        } else {
            E value = (E) cursor.getValue();
            cursor.setNext(cursor);
            cursor.setValue(null);
            temp = value;
        }
        return temp;
    }

    /**
     * Returns the value at the current cursor position. Returns a null if the
     * list is empty.
     *
     * @return the value
     */
    public E getValue() {
        if (cursor == null) {
            return null;
        } else {
            return (E) cursor.getValue();
        }
    }

    /**
     * Changes the current value at the current cursor position. Returns false
     * if the list is empty and true if the change is made.
     *
     * @param value the new value
     * @return true if successful, false if not
     */
    public boolean setValue(E value) {
        // TODO write method body //
        if (cursor == null) {
            return false;
        } 
        else{
            cursor.setValue(value);
            return true;
        }
       
    }

    /**
     * Moves the cursor to the previous value in the list and returns that
     * value. Returns a null if the list is empty.
     *
     * @return the value
     */
    public E getPrev() {

        if (cursor == null) {
            return null;
        } else {
            cursor = cursor.getPrev();
            return (E) cursor.getValue();
        }
    }

    /**
     * Moves the cursor to the next value in the list and returns that value.
     * Returns null if the list is empty.
     *
     * @return the value
     */
    public E getNext() {
         if (cursor == null) {
            return null;
        } else {
            cursor = cursor.getNext();
            return (E) cursor.getValue();
        }
    }

    /**
     * Moves the cursor to the next occurrence of the given value, moving
     * forward in the list. If the value is not found the cursor remains at the
     * same position in the list.
     *
     * @param value the value to search for
     * @return true if the value is found, false if not
     */
    public boolean moveToNext(E value) {
       if(cursor == null){
           return false;
       }
       else if(cursor.getValue()==value){
           return true;
       }
       while(cursor.getValue() != value){
           Node end = cursor;
           cursor = cursor.getNext();
       }
       return true;
    }

    /**
     * Moves the cursor to the next occurrence of the given value, moving
     * backwards in the list. If the value is not found the cursor remains at
     * the same position in the list.
     *
     * @param value the value to search for
     * @return true if the value is found, false if not
     */
    public boolean moveToPrev(E value) {
        if(cursor == null){
           return false;
       }
       else if(cursor.getValue()==value){
           return true;
       }
       while(cursor.getValue() != value){
           Node end = cursor;
           cursor = cursor.getPrev();
       }
       return true;
    }

    /**
     * Provides and EndlessList iterator.
     *
     * @return the iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new EndlessListIterator();
    }

    /**
     * Private class used to create an EndlessList iterator.
     */
    private class EndlessListIterator implements Iterator<E> {

        //fields
        private final Node START = cursor;
        private boolean handledStart = false;

        /**
         * Reports if the current node has not been reported yet by calling
         * next(). Returns false if the list is empty.
         *
         * @return true if the current node has not been reported, false if it
         * has
         */
        @Override
        public boolean hasNext() {
           if (START == null){
               return false;
           }
           else if(START.getNext()!=null){
               return true;
           }
           return false;
        }

        /**
         * Returns the current value in the list and moves to the next.
         *
         * @return the current value, or null if the list is empty
         */
        @Override
        public E next() {
           if(START==null){
               return null;
           }
           E total = (E)START.getNext();
           cursor = cursor.getNext();
           return total;
        }

        /**
         * Removes the last value returned from next(). This assumes that next
         * is called before each remove. If this is the only value in the list
         * the cursor becomes null.
         */
        @Override
        public void remove() {
         if(START==null){
             return;
          }
         else if(cursor.getPrev().getValue()!= null){
             cursor=null;
         }
         else{
             cursor.getPrev().getPrev().setNext(cursor);
            cursor.setPrev(cursor.getPrev().getPrev());
         }
        }

    }

}
