package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Mobile: ImageVector
    get() {
        if (_Mobile != null) {
            return _Mobile!!
        }
        _Mobile = ImageVector.Builder(
            name = "Filled.Mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.25f, 4.8f)
                curveToRelative(0f, -1.373f, 1.07f, -2.55f, 2.464f, -2.55f)
                horizontalLineToRelative(8.572f)
                curveToRelative(1.395f, 0f, 2.464f, 1.177f, 2.464f, 2.55f)
                verticalLineToRelative(14.4f)
                curveToRelative(0f, 1.373f, -1.07f, 2.55f, -2.464f, 2.55f)
                lineTo(7.714f, 21.75f)
                curveToRelative(-1.395f, 0f, -2.464f, -1.177f, -2.464f, -2.55f)
                close()
                moveTo(10.5f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _Mobile!!
    }

@Suppress("ObjectPropertyName")
private var _Mobile: ImageVector? = null
