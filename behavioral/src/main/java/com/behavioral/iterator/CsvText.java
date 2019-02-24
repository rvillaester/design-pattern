package com.behavioral.iterator;

public class CsvText implements Iterable<String> {

    private String entries[];

    public CsvText(String csv){
        entries = csv.split(",");
    }

    @Override
    public Iterator<String> getIterator() {
        return new CsvIterator();
    }

    private class CsvIterator implements Iterator<String> {
        private int i;

        @Override
        public boolean hasNext() {
            return entries.length > i;
        }

        @Override
        public String next() {
            if(hasNext()){
                return entries[i++];
            }
            return null;
        }
    }
}
