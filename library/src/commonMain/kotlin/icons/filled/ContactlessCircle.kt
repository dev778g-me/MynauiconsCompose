package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ContactlessCircle: ImageVector
    get() {
        if (_ContactlessCircle != null) {
            return _ContactlessCircle!!
        }
        _ContactlessCircle = ImageVector.Builder(
            name = "Filled.ContactlessCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(12.69f, -5.367f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.43f, 0.453f)
                curveToRelative(0.49f, 1.55f, 0.755f, 3.2f, 0.755f, 4.914f)
                reflectiveCurveToRelative(-0.265f, 3.365f, -0.756f, 4.914f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.43f, 0.453f)
                curveToRelative(0.537f, -1.694f, 0.826f, -3.498f, 0.826f, -5.367f)
                curveToRelative(0f, -1.87f, -0.289f, -3.673f, -0.826f, -5.367f)
                moveToRelative(-3.244f, 1.581f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.442f, 0.412f)
                curveToRelative(0.306f, 1.071f, 0.47f, 2.203f, 0.47f, 3.374f)
                curveToRelative(0f, 1.17f, -0.164f, 2.302f, -0.47f, 3.373f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.442f, 0.412f)
                curveToRelative(0.344f, -1.203f, 0.528f, -2.473f, 0.528f, -3.785f)
                reflectiveCurveToRelative(-0.184f, -2.582f, -0.528f, -3.786f)
                moveTo(7.833f, 9.258f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.564f, 0.899f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.687f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.462f, 0.333f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.354f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.898f, -0.565f)
            }
        }.build()

        return _ContactlessCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ContactlessCircle: ImageVector? = null
