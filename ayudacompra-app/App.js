import React from "react";
import InitialScreen from "./app/screens/InitialScreen";
import RequestDashboardScreen from "./app/screens/RequestDashboardScreen";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";

const Stack = createStackNavigator();

const App = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="InitialScreen" component={InitialScreen} />
        <Stack.Screen
          name="RequestDashboardScreen"
          component={RequestDashboardScreen}
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

export default App;
