package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterACircle: ImageVector
    get() {
        if (_LetterACircle != null) {
            return _LetterACircle!!
        }
        _LetterACircle = ImageVector.Builder(
            name = "Filled.LetterACircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.918f, 12.083f)
                horizontalLineToRelative(-1.836f)
                lineTo(12f, 9.636f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(10.452f, -4.763f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.404f, 0f)
                lineToRelative(-3f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.404f, 0.526f)
                lineToRelative(0.818f, -2.18f)
                horizontalLineToRelative(2.96f)
                lineToRelative(0.818f, 2.18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.404f, -0.526f)
                close()
            }
        }.build()

        return _LetterACircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterACircle: ImageVector? = null
