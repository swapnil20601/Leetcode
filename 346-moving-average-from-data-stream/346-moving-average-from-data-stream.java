class MovingAverage {
    private Deque<Integer> queue;
    private double sum;
    private int size;
    
    public MovingAverage(int size) {
        this.queue = new ArrayDeque<>();
        this.sum = 0;
        this.size = size;
    }
    
    public double next(int val) {
        this.sum += val;
        this.queue.add(val);
        
        if(this.queue.size() > this.size){
            this.sum = this.sum - this.queue.poll();
        }
        
        return this.sum/this.queue.size();
        //return avg;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
