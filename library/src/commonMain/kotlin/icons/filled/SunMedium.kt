package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SunMedium: ImageVector
    get() {
        if (_SunMedium != null) {
            return _SunMedium!!
        }
        _SunMedium = ImageVector.Builder(
            name = "Filled.SunMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 19.004f)
                lineTo(11.25f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.496f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                moveTo(7.53f, 16.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-1f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(1f, -1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.06f)
                moveToRelative(9.944f, -0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.056f, 1.056f)
                lineToRelative(0.052f, 0.056f)
                lineToRelative(1f, 1f)
                lineToRelative(0.056f, 0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.056f, -1.056f)
                lineToRelative(-0.052f, -0.056f)
                lineToRelative(-1f, -1f)
                close()
                moveTo(5.076f, 11.254f)
                lineTo(5f, 11.25f)
                lineTo(3.5f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                lineTo(5f, 12.75f)
                lineToRelative(0.076f, -0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.492f)
                moveToRelative(15.501f, 0f)
                lineToRelative(-0.077f, -0.004f)
                lineTo(19f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.077f, -0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.492f)
                moveTo(6.474f, 5.418f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.056f, 1.056f)
                lineToRelative(0.052f, 0.056f)
                lineToRelative(1f, 1f)
                lineToRelative(0.056f, 0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.056f, -1.056f)
                lineTo(7.53f, 6.47f)
                lineToRelative(-1f, -1f)
                close()
                moveTo(18.53f, 5.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.004f, -0.052f)
                lineToRelative(-0.056f, 0.052f)
                lineToRelative(-1f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(1f, -1f)
                lineToRelative(0.052f, -0.056f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.052f, -1.004f)
                moveTo(11.25f, 3.5f)
                lineTo(11.25f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                lineTo(12.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                moveToRelative(5.5f, 8.5f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9.5f, 0f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 0f)
            }
        }.build()

        return _SunMedium!!
    }

@Suppress("ObjectPropertyName")
private var _SunMedium: ImageVector? = null
