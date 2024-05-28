public class physics{
    float calculateVelocity(float distance, int time){
        return distance/time;
    }
    float calculateVelocity(float initialVelocity, float acceleration , int time){
        return initialVelocity + (acceleration * time);
    }
}
