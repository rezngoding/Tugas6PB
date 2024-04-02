package com.example.tugas6pb;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaskeenampbergerak.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private static List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisiasi itemList
        itemList = new ArrayList<>();
        itemList = new ArrayList<>();
        itemList.add(new Item("Bubur Manado", "Bubur Manado adalah hidangan khas dari daerah Manado, Sulawesi Utara, Indonesia. Hidangan ini terkenal dengan cita rasanya yang unik dan beragam bahan-bahan yang digunakannya. Bubur Manado memiliki tekstur yang kental dan biasanya disajikan dalam keadaan hangat.", R.drawable.gambar1));
        itemList.add(new Item("Soto Banjar", "Soto Banjar adalah sajian khas yang berasal dari daerah Banjarmasin, Kalimantan Selatan, Indonesia. Hidangan ini merupakan perpaduan harmonis antara berbagai bahan makanan segar dan rempah-rempah yang khas. Soto Banjar dikenal dengan kuahnya yang kaya rasa, beraroma harum, dan berwarna kuning keemasan.", R.drawable.gambar2));
        itemList.add(new Item("Lemper Ayam", "Lemper ayam adalah salah satu camilan yang populer di Indonesia, terutama di daerah Jawa. Hidangan ini terbuat dari ketan yang dilumatkan dan dilapisi dengan lapisan ayam suwir yang lezat. Lemper ayam memiliki cita rasa yang gurih dan legit, serta tekstur yang lembut dan kenyal.", R.drawable.gambar3));
        itemList.add(new Item("Klepon", "Klepon adalah salah satu jajanan tradisional Indonesia yang terkenal dengan rasa manisnya yang lezat dan tekstur kenyalnya yang unik. Hidangan ini terbuat dari campuran tepung ketan yang dibentuk bulat kecil dan diisi dengan gula merah cair. Setelah dibentuk, klepon kemudian direbus dalam air mendidih hingga matang. Saat dimakan, klepon memberikan sensasi meledak-ledak di mulut karena gula merah yang meleleh di dalamnya. Klepon seringkali juga dilumuri kelapa parut untuk memberikan aroma dan rasa yang lebih kaya.", R.drawable.gambar4));
        itemList.add(new Item("Soto Ayam Madura", "Soto Ayam Madura adalah salah satu varian soto ayam yang berasal dari Pulau Madura, Jawa Timur, Indonesia. Hidangan ini terkenal dengan kuah kaldu ayam yang kaya rasa dan rempah-rempah, serta disajikan dengan potongan daging ayam yang lembut, tauge, irisan daun bawang, dan bawang goreng. Biasanya disajikan bersama dengan lontong atau nasi putih, Soto Ayam Madura memiliki cita rasa yang gurih, hangat, dan menyegarkan, membuatnya menjadi hidangan yang cocok dinikmati baik di pagi hari maupun malam hari.", R.drawable.gambar5));
        itemList.add(new Item("Gulai Ikan Patin", "Gulai Ikan Patin adalah hidangan khas Indonesia yang terbuat dari ikan patin yang dimasak dalam kuah kari kental dan beraroma rempah. Hidangan ini sering dihidangkan bersama dengan nasi hangat dan disajikan dalam berbagai acara spesial.", R.drawable.gambar6));
        itemList.add(new Item("Rawon", "Rawon adalah hidangan khas Jawa Timur yang terkenal dengan kuahnya yang kaya rempah dan warna hitam pekat yang dihasilkan dari kluwek. Disajikan dengan daging sapi yang empuk dan irisan telur asin, Rawon merupakan hidangan yang lezat dan sarat akan cita rasa tradisional Indonesia.", R.drawable.gambar7));
        itemList.add(new Item("Tengkleng", "Tengkleng adalah hidangan khas Jawa Tengah yang terbuat dari daging kambing yang dimasak dengan rempah-rempah khas seperti serai, daun salam, dan jahe. Kuahnya yang gurih dan kental membuat Tengkleng menjadi hidangan yang sangat disukai, seringkali disajikan dengan nasi hangat dan sambal.", R.drawable.gambar8));
        itemList.add(new Item("Opor Ayam", "Opor Ayam adalah hidangan khas Indonesia yang terbuat dari potongan ayam yang dimasak dalam kuah santan kental yang diberi bumbu rempah-rempah seperti lengkuas, kunyit, dan ketumbar. Hidangan ini memiliki cita rasa lezat dan sering disajikan dalam berbagai acara tradisional.", R.drawable.gambar9));
        itemList.add(new Item("Klepon", "Klepon adalah salah satu jajanan tradisional Indonesia yang terkenal dengan rasa manisnya yang lezat dan tekstur kenyalnya yang unik. Hidangan ini terbuat dari campuran tepung ketan yang dibentuk bulat kecil dan diisi dengan gula merah cair. Setelah dibentuk, klepon kemudian direbus dalam air mendidih hingga matang. Saat dimakan, klepon memberikan sensasi meledak-ledak di mulut karena gula merah yang meleleh di dalamnya. Klepon seringkali juga dilumuri kelapa parut untuk memberikan aroma dan rasa yang lebih kaya.", R.drawable.gambar10));
        itemList.add(new Item("Sop Konro", "Sop Konro adalah hidangan khas dari Makassar, Sulawesi Selatan, Indonesia. Hidangan ini terkenal dengan kuah kaldunya yang kaya rempah dan daging iga sapi yang empuk. Disajikan dengan nasi putih hangat dan dilengkapi dengan bawang goreng serta perasan jeruk nipis, Sop Konro merupakan hidangan yang sangat menggugah selera.", R.drawable.gambar11));
        itemList.add(new Item("Sayur Gulai Paku", "Sayur Gulai Paku adalah hidangan khas Indonesia yang terbuat dari paku yang dimasak dalam kuah gulai kental yang gurih. Hidangan ini sering dihidangkan bersama dengan nasi hangat dan sambal, menciptakan kombinasi rasa yang lezat dan menyehatkan.", R.drawable.gambar12));
        itemList.add(new Item("Lontong Balap Khas Surabaya", "Lontong Balap adalah hidangan khas dari Surabaya, Jawa Timur, Indonesia. Hidangan ini terdiri dari lontong, tauge, taoge, bawang goreng, irisan mentimun, dan kerupuk, disajikan dengan kuah kacang yang gurih. Lontong Balap merupakan hidangan yang lezat dan cocok dinikmati sebagai sarapan atau camilan di berbagai kesempatan.", R.drawable.gambar13));
        itemList.add(new Item("Kue Rangi", "Kue Rangi adalah jajanan tradisional Indonesia yang terbuat dari campuran tepung beras, kelapa parut, gula merah, dan daun pandan. Kue ini kemudian dibungkus dalam daun pisang dan dipanggang hingga matang. Kue Rangi memiliki cita rasa yang manis dan aroma kelapa yang khas, membuatnya menjadi camilan yang sangat disukai di Indonesia.", R.drawable.gambar14));
        itemList.add(new Item("Soto Ayam Kampung", "Soto Ayam Kampung adalah hidangan khas Indonesia yang terbuat dari potongan daging ayam yang dimasak dalam kuah kaldu yang kaya rempah. Hidangan ini sering dihidangkan dengan tambahan taoge, potongan ketupat, irisan daun bawang, dan bawang goreng, serta disajikan dengan sambal dan perasan jeruk nipis. Soto Ayam Kampung merupakan hidangan yang lezat dan hangat, cocok dinikmati kapan pun Anda inginkan.", R.drawable.gambar15));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ItemAdapter(itemList, this);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(this);
    }

    public static List<Item> getItemList() {
        return itemList;
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("ITEM_POSITION", position);
        intent.putExtra("ADDITIONAL_DETAIL", itemList.get(position).getAdditionalDetail());
        startActivity(intent);
    }
}