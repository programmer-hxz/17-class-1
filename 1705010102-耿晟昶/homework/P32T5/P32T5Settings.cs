using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Collections.ObjectModel;
using System.ComponentModel;
using log4net;
using WpfApp1.Triton.Common;
using WpfApp1.Triton.Common.settings;
using Logger = WpfApp1.Triton.Common.LogUtilities.LogManagers;

namespace P32T5
{

    /// <summary>
    /// P32T5.xaml 的交互逻辑
    /// </summary>
    public class P32T5Settings : JsonSettings,INotifyPropertyChanged
    {
        private static readonly ILog Log = Logger.GetLoggerInstanceForType();
        private static P32T5Settings _instance;

        private int year=1974;
        private int count_daily=10;
        private int day_permonth=30;
        private int pay=1000;
        private int bit=16;
        private double demand = 205633.8146945;
        private double price= 9870.4231;
        private double cost= 57120.504;

        /// <summary>The current instance for this class. </summary>
        public static P32T5Settings Instance
        {
            get { return _instance ?? (_instance = new P32T5Settings()); }
        }

        public void Reset()
        {
            Log.InfoFormat("[P32T5] Reset ");
            bit = 16;
			OnPropertyChanged("Bit");
            year = 1974;
			OnPropertyChanged("Year");
            count_daily = 10;
			OnPropertyChanged("Count_daily");
            day_permonth = 30;
			OnPropertyChanged("Day_permonth");
            pay = 1000;
			OnPropertyChanged("Pay");
            demand = 205633.8146945;
            price = 9870.4231;
            cost = 57120.504;
			caclute();
        }

        public int Bit
        {
            get{ return bit;}
            set
            {
                bit = value;
                if (bit < 0)
                {
                    bit = 16;
                    Log.Warn("[P32T5] Bit can't be less than 1900.");
                }
                Log.InfoFormat("[P32T5] Bit = {0}." , bit);
                caclute();
				OnPropertyChanged("Bit");
            }
        }

        public int Year
        {
            get{ return year;}
            set
            {
                year = value;
                if (year < 1900)
                {
                    year = 1974;
                    Log.Warn("[P32T5] Year can't be less than 1900.");
                }
                Log.InfoFormat("[P32T5] Year = {0}." , year);
                caclute();
				OnPropertyChanged("Year");
            }
        }
        public int Count_daily
        {
            get{ return count_daily;}
            set
            {
                count_daily = value;
                if (count_daily <= 0)
                {
                    count_daily = 10;
                    Log.WarnFormat("[P32T5] The count can't be less than 0.");
                }
                Log.InfoFormat("[P32T5] count = {0}." , count_daily);
                caclute();
				OnPropertyChanged("Count_daily");
            }
        }
        public int Day_permonth
        {
            get{ return day_permonth;}
            set
            {
                day_permonth = value;
                if (day_permonth <= 0)
                {
                    day_permonth = 30;
                    Log.WarnFormat("[P32T5] The number can't be less than 0.");
                }
                if (day_permonth > 31)
                {
                    day_permonth = 30;
                    Log.WarnFormat("[P32T5] The number can't be more than 31.");
                }
                Log.InfoFormat("[P32T5] the number of days = {0}." , day_permonth);
                caclute();
				OnPropertyChanged("Day_permonth");
            }
        }
        public int Pay
        {
            get{ return pay;}
            set
            {
                if (value < 0)
                {
                    pay = 1000;
                    Log.WarnFormat("[P32T5] Pay can't be less than 0.");
                }
                else
				{
					pay = value;
				}
                Log.InfoFormat("[P32T5] pay = {0}." , pay);
                caclute();
				OnPropertyChanged("Pay");
            }
        }
        public double Demand
        {
            get{ return demand;}
            set
            {
                demand = value;
                Log.InfoFormat("[P32T5] Demand = {0}." , demand);
				OnPropertyChanged("Demand");
            }
        }
        public double Price
        {
            get{ return price;}
            set
            {
                price = value;
                Log.InfoFormat("[P32T5] Price = {0}." , price);
				OnPropertyChanged("Price");
            }
        }
        public double Cost
        {
            get{ return cost;}
            set
            {
                cost = value;
                Log.InfoFormat("[P32T5] Cost = {0}." , cost);
				OnPropertyChanged("Cost");
            }
        }

        public P32T5Settings() : base(GetSettingsFilePath(Configuration.Instance.Name, string.Format("{0}.json", "P32T5")))
        {
        }
		
		public event PropertyChangedEventHandler PropertyChanged;
		public virtual void OnPropertyChanged(string propertyName)
		{
			if (PropertyChanged != null)
			{
				PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
			}
		}
		
        private void caclute()
        {
			double a,b,c;
            a = (double)(4080.0 * System.Math.Pow(System.Math.E, (year - 1960.0) * 0.28));
			if(Bit==16)b = (double)(a * 0.048 * System.Math.Pow(0.72, year - 1974 + 0.0));
			else b = a * 30.0 * System.Math.Pow(0.72, year - 1974 + 0.0) / Bit;
            c = (double)(Pay * ((double)a / Count_daily / Day_permonth / 12.0));
			Demand=a;
			Price=b;
			Cost=c;
        }
    }
}
