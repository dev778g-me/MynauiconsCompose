package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ShootingStar: ImageVector
    get() {
        if (_ShootingStar != null) {
            return _ShootingStar!!
        }
        _ShootingStar = ImageVector.Builder(
            name = "Filled.ShootingStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.883f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(2.647f, 2.647f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                close()
                moveTo(4.59f, 3.528f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.527f, 4.59f)
                lineToRelative(5.824f, 5.824f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.061f)
                close()
                moveTo(15.318f, 7.959f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.342f, 0f)
                lineTo(11.97f, 11.97f)
                lineToRelative(-4.01f, 2.006f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.342f)
                lineToRelative(4.011f, 2.006f)
                lineToRelative(2.006f, 4.011f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.342f, 0f)
                lineToRelative(2.006f, -4.011f)
                lineToRelative(4.011f, -2.006f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.342f)
                lineToRelative(-4.011f, -2.006f)
                close()
                moveTo(3.53f, 8.823f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(2.647f, 2.647f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                close()
            }
        }.build()

        return _ShootingStar!!
    }

@Suppress("ObjectPropertyName")
private var _ShootingStar: ImageVector? = null
