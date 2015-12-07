/*
This file is part of ZAX.

	ZAX is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	ZAX is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with ZAX.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.inovex.zabbixmobile.listeners;

import com.inovex.zabbixmobile.model.Event;

public interface OnAcknowledgeEventListener {
	/**
	 * This method performs a Zabbix call to acknowledge the given event.
	 * 
	 * @param event
	 *            the event to be acknowledged
	 * @param comment
	 *            comment
	 */
	public void acknowledgeEvent(Event event, String comment);

	/**
	 * Callback method which is called when acknowledgment has been successful.
	 */
	public void onEventAcknowledged();
}