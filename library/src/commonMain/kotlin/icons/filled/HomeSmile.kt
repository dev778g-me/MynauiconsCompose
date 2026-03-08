package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HomeSmile: ImageVector
    get() {
        if (_HomeSmile != null) {
            return _HomeSmile!!
        }
        _HomeSmile = ImageVector.Builder(
            name = "Filled.HomeSmile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.191f, 2.9f)
                arcToRelative(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.618f, 0f)
                lineToRelative(5.866f, 4.818f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.075f, 2.29f)
                verticalLineToRelative(8.802f)
                curveToRelative(0f, 1.605f, -1.273f, 2.94f, -2.883f, 2.94f)
                lineTo(6.133f, 21.75f)
                curveToRelative(-1.61f, 0f, -2.883f, -1.335f, -2.883f, -2.94f)
                verticalLineToRelative(-8.802f)
                curveToRelative(0f, -0.886f, 0.392f, -1.73f, 1.075f, -2.29f)
                close()
                moveTo(10.25f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(15.25f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(9.447f, 15.398f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.894f, 1.204f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.75f)
                arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.447f, -1.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.894f, -1.204f)
                arcTo(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.25f)
                arcToRelative(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.553f, -0.852f)
            }
        }.build()

        return _HomeSmile!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSmile: ImageVector? = null
