package _15mediator;

/**
 * Created by Administrator on 下午 9:57.
 */
public class Mediator {
    private Man man;
    private Women women;

    public void setMan(Man man) {
        this.man = man;
    }

    public void setWomen(Women women) {
        this.women = women;
    }

    public void getPattern(Person person){
        if(person instanceof Man){
            man=(Man)person;
        }else{
            women=(Women)person;
        }
        if(person instanceof Man){
            if(women!=null){
                if(women.getAge()==person.getAge()){
                    System.out.println(women.getName()+"和"+person.getName()+"相配");
                }else{
                    System.out.println(women.getName()+"和"+person.getName()+"不相配");
                }
            }else{
                System.out.println("不好意思，我们没有女性会员了");
            }
        }else{
            if (man != null) {
                if (man.getAge() == person.getAge()) {
                    System.out.println(man.getName() + "和" + person.getName() + "相配");
                } else {
                    System.out.println(man.getName() + "和" + person.getName() + "不相配");
                }
            } else {
                System.out.println("不好意思，我们没有男性会员了");
            }
        }

    }
}
