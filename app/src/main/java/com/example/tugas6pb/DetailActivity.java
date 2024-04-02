package com.example.tugas6pb;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get data from Intent
        int position = getIntent().getIntExtra("ITEM_POSITION", -1);

        if (position != -1) {
            Item item = MainActivity.getItemList().get(position);

            ImageView imageViewDetail = findViewById(R.id.imageViewDetail);
            TextView textViewNameDetail = findViewById(R.id.textViewNameDetail);
            TextView textViewDescriptionDetail = findViewById(R.id.textViewDescriptionDetail);
            TextView textViewAdditionalDetail = findViewById(R.id.textViewAdditionalDetail);


            imageViewDetail.setImageResource(item.getImageResource());
            textViewNameDetail.setText(item.getName());
            textViewDescriptionDetail.setText(item.getDescription());
            textViewAdditionalDetail.setText(item.getAdditionalDetail());

            String AdditionalText = "";

            switch (item.getName()) {
                case "Bubur Manado":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Bubur Manado adalah hidangan khas dari daerah Manado, Sulawesi Utara, Indonesia. Hidangan ini terkenal dengan cita rasanya yang unik dan beragam bahan-bahan yang digunakannya. Bubur Manado memiliki tekstur yang kental dan biasanya disajikan dalam keadaan hangat.\n";
                    break;
                case "Soto Banjar":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Soto Banjar adalah sajian khas yang berasal dari daerah Banjarmasin, Kalimantan Selatan, Indonesia. Hidangan ini merupakan perpaduan harmonis antara berbagai bahan makanan segar dan rempah-rempah yang khas. Soto Banjar dikenal dengan kuahnya yang kaya rasa, beraroma harum, dan berwarna kuning keemasan.\n";
                    break;
                case "Lemper Ayam":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Lemper ayam adalah salah satu camilan yang populer di Indonesia, terutama di daerah Jawa. Hidangan ini terbuat dari ketan yang dilumatkan dan dilapisi dengan lapisan ayam suwir yang lezat. Lemper ayam memiliki cita rasa yang gurih dan legit, serta tekstur yang lembut dan kenyal.\n";
                    break;
                case "Klepon":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Klepon adalah salah satu jajanan tradisional Indonesia yang terkenal dengan rasa manisnya yang lezat dan tekstur kenyalnya yang unik. Hidangan ini terbuat dari campuran tepung ketan yang dibentuk bulat kecil dan diisi dengan gula merah cair. Setelah dibentuk, klepon kemudian direbus dalam air mendidih hingga matang. Saat dimakan, klepon memberikan sensasi meledak-ledak di mulut karena gula merah yang meleleh di dalamnya. Klepon seringkali juga dilumuri kelapa parut untuk memberikan aroma dan rasa yang lebih kaya.\n";
                    break;
                case "Soto Ayam Madura":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Soto Ayam Madura adalah salah satu varian soto ayam yang berasal dari Pulau Madura, Jawa Timur, Indonesia. Hidangan ini terkenal dengan kuah kaldu ayam yang kaya rasa dan rempah-rempah, serta disajikan dengan potongan daging ayam yang lembut, tauge, irisan daun bawang, dan bawang goreng. Biasanya disajikan bersama dengan lontong atau nasi putih, Soto Ayam Madura memiliki cita rasa yang gurih, hangat, dan menyegarkan, membuatnya menjadi hidangan yang cocok dinikmati baik di pagi hari maupun malam hari.\n";
                    break;
                case "Gulai Ikan Patin":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Gulai Ikan Patin adalah hidangan khas Indonesia yang terbuat dari ikan patin yang dimasak dalam kuah kari kental dan beraroma rempah. Hidangan ini sering dihidangkan bersama dengan nasi hangat dan disajikan dalam berbagai acara spesial.\n";
                    break;
                case "Rawon":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Rawon adalah hidangan khas Jawa Timur yang terkenal dengan kuahnya yang kaya rempah dan warna hitam pekat yang dihasilkan dari kluwek. Disajikan dengan daging sapi yang empuk dan irisan telur asin, Rawon merupakan hidangan yang lezat dan sarat akan cita rasa tradisional Indonesia.\n";
                    break;
                case "Tengkleng":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Tengkleng adalah hidangan khas Jawa Tengah yang terbuat dari daging kambing yang dimasak dengan rempah-rempah khas seperti serai, daun salam, dan jahe. Kuahnya yang gurih dan kental membuat Tengkleng menjadi hidangan yang sangat disukai, seringkali disajikan dengan nasi hangat dan sambal.\n";
                    break;
                case "Opor Ayam":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Opor Ayam adalah hidangan khas Indonesia yang terbuat dari potongan ayam yang dimasak dalam kuah santan kental yang diberi bumbu rempah-rempah seperti lengkuas, kunyit, dan ketumbar. Hidangan ini memiliki cita rasa lezat dan sering disajikan dalam berbagai acara tradisional.\n";
                    break;
                case "Sop Konro":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Sop Konro adalah hidangan khas dari Makassar, Sulawesi Selatan, Indonesia. Hidangan ini terkenal dengan kuah kaldunya yang kaya rempah dan daging iga sapi yang empuk. Disajikan dengan nasi putih hangat dan dilengkapi dengan bawang goreng serta perasan jeruk nipis, Sop Konro merupakan hidangan yang sangat menggugah selera.\n";
                    break;
                case "Sayur Gulai Paku":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Sayur Gulai Paku adalah hidangan khas Indonesia yang terbuat dari paku yang dimasak dalam kuah gulai kental yang gurih. Hidangan ini sering dihidangkan bersama dengan nasi hangat dan sambal, menciptakan kombinasi rasa yang lezat dan menyehatkan.\n";
                    break;
                case "Lontong Balap Khas Surabaya":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Lontong Balap adalah hidangan khas dari Surabaya, Jawa Timur, Indonesia. Hidangan ini terdiri dari lontong, tauge, taoge, bawang goreng, irisan mentimun, dan kerupuk, disajikan dengan kuah kacang yang gurih. Lontong Balap merupakan hidangan yang lezat dan cocok dinikmati sebagai sarapan atau camilan di berbagai kesempatan.\n";
                    break;
                case "Kue Rangi":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Kue Rangi adalah jajanan tradisional Indonesia yang terbuat dari campuran tepung beras, kelapa parut, gula merah, dan daun pandan. Kue ini kemudian dibungkus dalam daun pisang dan dipanggang hingga matang. Kue Rangi memiliki cita rasa yang manis dan aroma kelapa yang khas, membuatnya menjadi camilan yang sangat disukai di Indonesia.\n";
                    break;
                case "Soto Ayam Kampung":
                    AdditionalText = "Informasi Tambahan\n" +
                            "\n" +
                            "Soto Ayam Kampung adalah hidangan khas Indonesia yang terbuat dari potongan daging ayam yang dimasak dalam kuah kaldu yang kaya rempah. Hidangan ini sering dihidangkan dengan tambahan taoge, potongan ketupat, irisan daun bawang, dan bawang goreng, serta disajikan dengan sambal dan perasan jeruk nipis. Soto Ayam Kampung merupakan hidangan yang lezat dan hangat, cocok dinikmati kapan pun Anda inginkan.\n";
                    break;
                default:
            }
            textViewAdditionalDetail.setText(AdditionalText);
        }
    }
}


