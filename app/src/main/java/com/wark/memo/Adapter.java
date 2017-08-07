package com.wark.memo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pc on 2017-08-07.
 */

public class Adapter extends BaseAdapter{
    private ArrayList<data> items = new ArrayList<data>();

    @Override

        //데이터 개수를 알아보는 함수
        public int getCount() {
            return items.size();
        }

        @Override
        //index값을 리턴
        public Object getItem(int position) {
            return items.get(position);
        }


        @Override

        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final int pos = position;
            final Context context = parent.getContext();

            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.list_memo, parent, false);
            }

            TextView titleTextView = (TextView) convertView.findViewById(R.id.title) ;

            // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
            data item = (data) items.get(position);

            // 아이템 내 각 위젯에 데이터 반영
            titleTextView.setText(item.name);

            return convertView;
        }

        public void addItem(View.OnClickListener memo, String title) {
            data item = new data(title);

            item.setName(title);

            items.add(item);
        }

}
