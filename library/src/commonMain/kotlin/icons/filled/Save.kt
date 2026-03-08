package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Save: ImageVector
    get() {
        if (_Save != null) {
            return _Save!!
        }
        _Save = ImageVector.Builder(
            name = "Filled.Save",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 3.75f)
                verticalLineToRelative(1.897f)
                curveToRelative(0f, 0.46f, 0.375f, 0.838f, 0.844f, 0.838f)
                horizontalLineToRelative(5.312f)
                arcToRelative(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.844f, -0.838f)
                verticalLineToRelative(-1.83f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.57f, -0.067f)
                close()
                moveTo(17.313f, 21.75f)
                lineTo(6.688f, 21.75f)
                arcToRelative(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.938f, -3.927f)
                lineTo(2.75f, 6.176f)
                arcTo(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.688f, 2.25f)
                horizontalLineToRelative(8.242f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.783f, 1.15f)
                lineToRelative(2.383f, 2.374f)
                arcTo(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.55f)
                verticalLineToRelative(9.272f)
                arcToRelative(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.937f, 3.927f)
                moveToRelative(-1.813f, -1.5f)
                verticalLineToRelative(-4.015f)
                arcToRelative(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.844f, -0.838f)
                lineTo(9.344f, 15.396f)
                arcToRelative(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.844f, 0.838f)
                verticalLineToRelative(4.015f)
                close()
            }
        }.build()

        return _Save!!
    }

@Suppress("ObjectPropertyName")
private var _Save: ImageVector? = null
