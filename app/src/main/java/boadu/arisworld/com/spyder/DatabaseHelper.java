package boadu.arisworld.com.spyder;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import boadu.arisworld.com.spyder.data.Ambulance;
import boadu.arisworld.com.spyder.data.AutoMechanic;
import boadu.arisworld.com.spyder.data.FireService;
import boadu.arisworld.com.spyder.data.Police;
import boadu.arisworld.com.spyder.data.TireService;
import boadu.arisworld.com.spyder.data.TowingService;

public class DatabaseHelper {

    private FirebaseDatabase mDatabase ;//= FirebaseDatabase.getInstance();

    public DatabaseReference mRootDatabaseReference;
    public DatabaseReference mPoliceRef;
    public DatabaseReference mFireServiceRef;
    public DatabaseReference mAmbulnceRef;
    public DatabaseReference mAutoMechanicRef;
    public DatabaseReference mTireServiceRef;
    public DatabaseReference mTowingRef;
    public DatabaseReference mUserRef;
    public DatabaseReference mCityRef;

    public ChildEventListener mChildEventListener;
    public FirebaseAuth mFirebaseAuth;
    public FirebaseAuth.AuthStateListener mAuthStateListener;

    private  static DatabaseHelper DatabaseInstance = new DatabaseHelper();

    public static DatabaseHelper getDatabaseInstance(){
        return DatabaseInstance;
    }

    private DatabaseHelper(){
        this.mDatabase = FirebaseDatabase.getInstance();
        this.mRootDatabaseReference = mDatabase.getReference();
        this.mPoliceRef = mRootDatabaseReference.child("police");
        this.mFireServiceRef = mRootDatabaseReference.child("fire_service");
        this.mAmbulnceRef  = mRootDatabaseReference.child("ambulance");
        this.mAutoMechanicRef = mRootDatabaseReference.child("auto_mechanic");
        this.mTireServiceRef = mRootDatabaseReference.child("tire_service");
        this.mTowingRef = mRootDatabaseReference.child("towing_service");
        this.mUserRef = mRootDatabaseReference.child("user");

    }


    /*

    public <T> List<T>  getDataObjects(DataSnapshot dataSnapshot, Class<T> classObject  ){
        for (DataSnapshot subData : dataSnapshot.getChildren()){
            subData.getValue(classObject);
        }


    }

*/



    /*
    public <T>  List<T> getData( Class<T> objectClass){
            List<T> dataList = new ArrayList<>();

        return dataList;
    }
*/






































    public void setPolice(Police police){
        mPoliceRef.child(police.getId().toString()).setValue(police);
    }


    public void setmFireService(FireService fireService){
        mFireServiceRef.child(fireService.getId().toString()).setValue(fireService);
    }


    public void setmAmbulnce(Ambulance ambulnce){
        mAmbulnceRef.child(ambulnce.getId().toString()).setValue(ambulnce);
    }


    public void setmAutoMechanic(AutoMechanic autoMechanic){
        mAutoMechanicRef.child(autoMechanic.getId().toString()).setValue(autoMechanic);
    }

    public void setmTowing(TowingService towingService){
        mTowingRef.child(towingService.getId().toString()).setValue(towingService);
    }

    public void setmTireService(TireService tireService){
        mTireServiceRef.child(tireService.getId().toString()).setValue(tireService);
    }


}
