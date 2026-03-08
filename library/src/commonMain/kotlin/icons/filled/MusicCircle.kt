package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MusicCircle: ImageVector
    get() {
        if (_MusicCircle != null) {
            return _MusicCircle!!
        }
        _MusicCircle = ImageVector.Builder(
            name = "Filled.MusicCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, 5.385f, 4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                reflectiveCurveTo(2.25f, 6.615f, 2.25f, 12f)
                moveTo(14.5f, 8.75f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(5.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, -2.122f)
                verticalLineTo(8.6f)
                curveToRelative(0f, -0.746f, 0.604f, -1.35f, 1.35f, -1.35f)
                horizontalLineToRelative(1.4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
            }
        }.build()

        return _MusicCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MusicCircle: ImageVector? = null
