class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x1 = Math.max(ax1,bx1);
        int y1 = Math.max(by1,ay1);
        int x2 = Math.min(ax2,bx2);
        int y2 = Math.min(by2,ay2);
        int width = Math.max(0,y2-y1);
        int height = Math.max(0,x2-x1);
        return ((ay2-ay1)*(ax2-ax1))+((by2-by1)*(bx2-bx1))-width*height;
    }
}