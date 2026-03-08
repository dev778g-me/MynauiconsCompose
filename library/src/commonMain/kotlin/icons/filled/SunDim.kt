package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SunDim: ImageVector
    get() {
        if (_SunDim != null) {
            return _SunDim!!
        }
        _SunDim = ImageVector.Builder(
            name = "Filled.SunDim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 19.004f)
                verticalLineToRelative(0.496f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-0.496f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                moveTo(7.53f, 16.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.06f)
                moveToRelative(9.944f, -0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.056f, 1.056f)
                lineToRelative(0.052f, 0.056f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(0.056f, 0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.056f, -1.056f)
                lineToRelative(-0.052f, -0.056f)
                lineToRelative(-0.5f, -0.5f)
                close()
                moveTo(5.076f, 11.254f)
                lineTo(5f, 11.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                lineTo(5f, 12.75f)
                lineToRelative(0.076f, -0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.492f)
                moveToRelative(14.501f, 0f)
                lineToRelative(-0.077f, -0.004f)
                lineTo(19f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.5f)
                lineToRelative(0.077f, -0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.492f)
                moveTo(6.974f, 5.918f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.056f, 1.056f)
                lineToRelative(0.052f, 0.056f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(0.056f, 0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.056f, -1.056f)
                lineTo(7.53f, 6.47f)
                lineToRelative(-0.5f, -0.5f)
                close()
                moveTo(18.03f, 5.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.004f, -0.052f)
                lineToRelative(-0.056f, 0.052f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.06f)
                moveTo(11.25f, 4.5f)
                lineTo(11.25f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                moveToRelative(5.5f, 7.5f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9.5f, 0f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 0f)
            }
        }.build()

        return _SunDim!!
    }

@Suppress("ObjectPropertyName")
private var _SunDim: ImageVector? = null
