package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Command: ImageVector
    get() {
        if (_Command != null) {
            return _Command!!
        }
        _Command = ImageVector.Builder(
            name = "Filled.Command",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.261f, 5.977f)
                curveToRelative(0f, -3.33f, 4.137f, -4.944f, 6.422f, -2.66f)
                curveToRelative(2.284f, 2.285f, 0.67f, 6.422f, -2.66f, 6.422f)
                lineTo(15.76f, 9.739f)
                verticalLineToRelative(4.522f)
                horizontalLineToRelative(2.262f)
                curveToRelative(3.33f, 0f, 4.944f, 4.137f, 2.66f, 6.422f)
                curveToRelative(-2.285f, 2.284f, -6.422f, 0.67f, -6.422f, -2.66f)
                verticalLineToRelative(-2.261f)
                lineTo(9.738f, 15.762f)
                verticalLineToRelative(2.26f)
                curveToRelative(0f, 3.331f, -4.136f, 4.945f, -6.42f, 2.66f)
                curveToRelative(-2.285f, -2.284f, -0.671f, -6.42f, 2.659f, -6.42f)
                horizontalLineToRelative(2.261f)
                lineTo(8.238f, 9.739f)
                lineTo(5.977f, 9.739f)
                curveToRelative(-3.33f, 0f, -4.944f, -4.137f, -2.66f, -6.422f)
                curveToRelative(2.285f, -2.284f, 6.421f, -0.67f, 6.421f, 2.66f)
                lineTo(9.738f, 8.24f)
                horizontalLineToRelative(4.523f)
                close()
                moveTo(14.261f, 9.739f)
                lineTo(9.738f, 9.739f)
                verticalLineToRelative(4.522f)
                horizontalLineToRelative(4.523f)
                close()
            }
        }.build()

        return _Command!!
    }

@Suppress("ObjectPropertyName")
private var _Command: ImageVector? = null
