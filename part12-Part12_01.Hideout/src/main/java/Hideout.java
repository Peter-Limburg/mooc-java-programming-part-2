public class Hideout<T> {
        T t;

        public Hideout(){
            this.t = t;
        }

        public void putIntoHideout(T toHide){
                this.t = toHide;
        }

        public T takeFromHideout(){
            if (this.t == null){
                return null;
            }
            T r = this.t;
            this.t = null;
            return r;
        }

        public boolean isInHideout(){
            if (t != null){
                return true;
            }
            return false;
        }


}
