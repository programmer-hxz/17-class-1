using System;
using System.IO;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Markup;
using log4net;
using WpfApp1.Triton.Common;
using WpfApp1.Triton.Common.Plugins;
using Logger = WpfApp1.Triton.Common.LogUtilities.LogManagers;

namespace P32T5
{
    public class P32T5 : IPlugin
    {
        private static readonly ILog Log = Logger.GetLoggerInstanceForType();

        private bool _enabled;

        private UserControl _control;

        #region Implementation of IPlugin

        public string Name
		{
			get
			{
				return "P32T5";
			}
		}

        public string Author
		{
			get
			{
				return "1705010102 GSC";
			}
		}

        public string Description
		{
			get
			{
				return "The 5th topic On \"Introduction to Software Engineering\" Page 32.";
			}
		}

        public string Version
		{
			get
			{ 
				return "4.3";
			}
		}

        public UserControl Control
        {
            get
            {
                if (_control != null)
                {
                    return _control;
                }

                using (var fs = new FileStream(@"Plugins\P32T5\P32T5.xaml", FileMode.Open))
                {
                    var root = (System.Windows.Controls.UserControl)XamlReader.Load(fs);
                    // Your settings binding here.

                    // Year
                    if (
                        !Wpf.SetupTextBoxBinding(root, "YearTextBox",
                            "Year",
                            BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat(
                            "[P32T5] SetupCheckBoxBinding failed for 'Year'.");
                        throw new Exception("The SettingsControl could not be created.");
					}
					
                    // Bit
                    if (
                        !Wpf.SetupTextBoxBinding(root, "BitsTextBox",
                            "Bit",
                            BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat(
                            "[P32T5] SetupCheckBoxBinding failed for 'Bit'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Count_daily
                    if (
                        !Wpf.SetupTextBoxBinding(root, "ComCountTextBox",
                            "Count_daily",
                            BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat(
                            "[P32T5] SetupCheckBoxBinding failed for 'Count_daily'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Pay
                    if (
                        !Wpf.SetupTextBoxBinding(root, "PiceCountTextBox",
                            "Pay",
                            BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat(
                            "[P32T5] SetupCheckBoxBinding failed for 'Pay'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Day_permonth
                    if (
                        !Wpf.SetupTextBoxBinding(root, "DayInMonTextBox",
                            "Day_permonth",
                            BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat(
                            "[P32T5] SetupCheckBoxBinding failed for 'Day'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Demand
                    if (
                        !Wpf.SetupTextBoxBinding(root, "ResNeedTextBox",
                            "Demand",
                            BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat(
                            "[P32T5] SetupCheckBoxBinding failed for 'Demand'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Price
                    if (!Wpf.SetupTextBoxBinding(root, "ResPriTextBox", "Price",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'Price'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Cost
                    if (!Wpf.SetupTextBoxBinding(root, "ResCostTextBox", "Cost",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'Cost'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }
                    /*
                    // StopWinCount
                    if (!Wpf.SetupTextBoxBinding(root, "StopWinCountTextBox", "StopWinCount",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'StopWinCountTextBox'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // StopLossCount
                    if (!Wpf.SetupTextBoxBinding(root, "StopLossCountTextBox", "StopLossCount",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'StopLossCountTextBox'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // StopConcedeCount
                    if (!Wpf.SetupTextBoxBinding(root, "StopConcedeCountTextBox", "StopConcedeCount",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'StopConcedeCountTextBox'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Rank
                    if (!Wpf.SetupTextBoxBinding(root, "RankTextBox", "Rank",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'RankTextBox'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Wins
                    if (!Wpf.SetupTextBoxBinding(root, "WinsTextBox", "Wins",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'WinsTextBox'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Losses
                    if (!Wpf.SetupTextBoxBinding(root, "LossesTextBox", "Losses",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'LossesTextBox'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }

                    // Concedes
                    if (!Wpf.SetupTextBoxBinding(root, "ConcedesTextBox", "Concedes",
                        BindingMode.TwoWay, P32T5Settings.Instance))
                    {
                        Log.DebugFormat("[P32T5] SetupTextBoxBinding failed for 'ConcedesTextBox'.");
                        throw new Exception("The SettingsControl could not be created.");
                    }
                    */
                    // Your settings event handlers here.
                    var resetButton = Wpf.FindControlByName<Button>(root, "ResetButton");
                    resetButton.Click += ResetButtonOnClick;

                    //var addWinButton = Wpf.FindControlByName<Button>(root, "AddWinButton");
                    //addWinButton.Click += AddWinButtonOnClick;

                    //var addLossButton = Wpf.FindControlByName<Button>(root, "AddLossButton");
                    //addLossButton.Click += AddLossButtonOnClick;

                    //var addConcedeButton = Wpf.FindControlByName<Button>(root, "AddConcedeButton");
                    //addConcedeButton.Click += AddConcedeButtonOnClick;

                    //var removeWinButton = Wpf.FindControlByName<Button>(root, "RemoveWinButton");
                    //removeWinButton.Click += RemoveWinButtonOnClick;

                    //var removeLossButton = Wpf.FindControlByName<Button>(root, "RemoveLossButton");
                    //removeLossButton.Click += RemoveLossButtonOnClick;

                    //var removeConcedeButton = Wpf.FindControlByName<Button>(root, "RemoveConcedeButton");
                    //removeConcedeButton.Click += RemoveConcedeButtonOnClick;

                    _control = root;
                }

                return _control;
            }
        }

        public JsonSettings Settings
        {
            get 
			{ 
				return P32T5Settings.Instance; 
			}
        }

        public void Disable()
        {
            Log.DebugFormat("[P32T5] Disable");
            _enabled = false;
        }

        public void Enable()
        {
            Log.DebugFormat("[P32T5] Enable");
            _enabled = true;
        }
		
        public bool IsEnabled
        {
            get { return _enabled; }
        }

        public void Initialize()
        {
        }

        public void Start()
        {
        }

        public void Stop()
        {
        }

        public void Tick()
        {
        }

        #endregion


        #region Implementation of IDisposable

        public void Deinitialize()
        {
        }

        #endregion


        #region Override of Object

        /// <summary>
        /// 
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            return Name + ": " + Description;
        }

        private void ResetButtonOnClick(object sender, RoutedEventArgs routedEventArgs)
        {
            P32T5Settings.Instance.Reset();
        }
        
        #endregion

    }
}
