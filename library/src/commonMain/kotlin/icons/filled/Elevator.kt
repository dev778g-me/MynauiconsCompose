package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Elevator: ImageVector
    get() {
        if (_Elevator != null) {
            return _Elevator!!
        }
        _Elevator = ImageVector.Builder(
            name = "Filled.Elevator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.15f, 2.464f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.05f, 1.072f)
                lineToRelative(1.626f, 1.589f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.048f, 0f)
                lineTo(17.4f, 3.536f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.048f, -1.072f)
                lineTo(15.25f, 3.54f)
                close()
                moveTo(9.274f, 2.464f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.048f, 0f)
                lineTo(6.6f, 4.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.048f, 1.073f)
                lineTo(8.75f, 4.049f)
                lineToRelative(1.1f, 1.076f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, -1.073f)
                close()
                moveTo(12.75f, 21.75f)
                horizontalLineToRelative(3.75f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.25f, 19f)
                verticalLineToRelative(-8.706f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, -2.75f)
                horizontalLineToRelative(-3.75f)
                close()
                moveTo(11.25f, 7.544f)
                lineTo(7.5f, 7.544f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 2.75f)
                lineTo(4.75f, 19f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 2.75f)
                horizontalLineToRelative(3.75f)
                close()
            }
        }.build()

        return _Elevator!!
    }

@Suppress("ObjectPropertyName")
private var _Elevator: ImageVector? = null
