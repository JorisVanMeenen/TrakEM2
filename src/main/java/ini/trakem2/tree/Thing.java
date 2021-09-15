/*-
 * #%L
 * TrakEM2 plugin for ImageJ.
 * %%
 * Copyright (C) 2005 - 2021 Albert Cardona, Stephan Saalfeld and others.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


package ini.trakem2.tree;

import java.util.ArrayList;

public interface Thing {

	public boolean canHaveAsChild(Thing thing);
	
	public String getType();

	public String getTitle();

	public String toString();

	public boolean hasChildren();

	public ArrayList<? extends Thing> getChildren();

	public Object getObject();

	public boolean addChild(Thing thing);

	public void setParent(Thing thing);

	public Thing getParent();

	public Thing findChild(Object ob);

	public void debug(String indent);

	public boolean isExpanded();

	public String getInfo();

	public Thing shallowCopy();
}
