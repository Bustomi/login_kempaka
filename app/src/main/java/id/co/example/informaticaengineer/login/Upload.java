package id.co.example.informaticaengineer.login;


import android.location.Address;

import com.google.firebase.database.Exclude;

public class Upload {
        private String aName;
        private String eImageUrl;
        private String eAlamat;
        private String no_tlpn;
        private String mEmail;
        private String universitas;
        private String mKey;



        public Upload(){
            //construtor
        }

        public Upload(String name ,String alamat ,String tlpn ,String kuliah ,String email, String imageUrl) {
            if (name.trim().equals("")) {
                name = "No Name";
            }

            this.aName = name;
            this.eImageUrl = imageUrl;
            this.eAlamat = alamat;
            this.no_tlpn = tlpn;
            this.universitas = kuliah;
            this.mEmail = email;

        }


        public String getName() {
            return aName;
        }

        public void setName(String name) {
            aName = name;
        }

        public String geteAlamat() {
            return eAlamat;
        }

        public void seteAlamat(String eAlamat) {
            this.eAlamat = eAlamat;
        }

        public String getNo_tlpn() {
            return no_tlpn;
        }

        public void setNo_tlpn(String no_tlpn) {
            this.no_tlpn = no_tlpn;
        }

        public String getUniversitas() {
            return universitas;
        }

        public void setUniversitas(String universitas) {
            this.universitas = universitas;
        }

        public String getmEmail() {
            return mEmail;
        }

        public void setmEmail(String mEmail) {
            this.mEmail = mEmail;
        }

        public String getImageUrl() {
                return eImageUrl;
            }

        public void setImageUrl(String imageUrl){ eImageUrl = imageUrl; }



    @Exclude
        public String getKey() {
            return  mKey;
        }

        @Exclude
        public void setKey(String key) {
            mKey =key;
        }
    }

