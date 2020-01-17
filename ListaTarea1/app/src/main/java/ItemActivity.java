import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.listatarea1.R;

public class ItemActivity extends Activity {
    TextView mItem = null;
    TextView mPlace = null;
    TextView mDescription = null;
    TextView mImportance = null;

    Integer mRowId = null;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_item);

    }
}
