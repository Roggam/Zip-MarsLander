public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {

        int burn = (status.getVelocity() * status.getVelocity())/(2 * status.getAltitude());

        if(status.Altitude < 100){
           burn = 102 - status.getAltitude() + status.getVelocity();
        }

        if(status.Altitude == 2){
         burn = 99 + status.getVelocity();
        }

        if(status.getAltitude() == 1){
          burn = 99;
        }

        System.out.println(burn); /*hack!*/

        return burn;

    }

}
