package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterB: ImageVector
    get() {
        if (_LetterB != null) {
            return _LetterB!!
        }
        _LetterB = ImageVector.Builder(
            name = "Filled.LetterB",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4.589f)
                curveToRelative(2.006f, 0f, 3.106f, -1.54f, 3.265f, -3.047f)
                curveToRelative(0.105f, -1.006f, -0.183f, -2.127f, -0.937f, -2.953f)
                curveToRelative(0.754f, -0.826f, 1.042f, -1.947f, 0.937f, -2.953f)
                curveTo(16.694f, 7.54f, 15.595f, 6f, 13.589f, 6f)
                close()
                moveTo(10f, 11f)
                lineTo(10f, 8f)
                horizontalLineToRelative(3.589f)
                curveToRelative(0.384f, 0f, 0.677f, 0.133f, 0.885f, 0.346f)
                curveToRelative(0.211f, 0.216f, 0.35f, 0.53f, 0.39f, 0.91f)
                curveToRelative(0.077f, 0.727f, -0.243f, 1.431f, -0.903f, 1.744f)
                close()
                moveTo(10f, 16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.96f)
                curveToRelative(0.66f, 0.313f, 0.98f, 1.017f, 0.904f, 1.743f)
                curveToRelative(-0.04f, 0.382f, -0.179f, 0.695f, -0.39f, 0.911f)
                curveToRelative(-0.208f, 0.213f, -0.501f, 0.346f, -0.885f, 0.346f)
                close()
            }
        }.build()

        return _LetterB!!
    }

@Suppress("ObjectPropertyName")
private var _LetterB: ImageVector? = null
