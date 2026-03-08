package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterXCircle: ImageVector
    get() {
        if (_LetterXCircle != null) {
            return _LetterXCircle!!
        }
        _LetterXCircle = ImageVector.Builder(
            name = "Filled.LetterXCircle",
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
                moveTo(9.6f, 7.55f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.2f, 0.9f)
                lineTo(11.062f, 12f)
                lineTo(8.4f, 15.55f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, 0.9f)
                lineToRelative(2.4f, -3.2f)
                lineToRelative(2.4f, 3.2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, -0.9f)
                lineTo(12.938f, 12f)
                lineTo(15.6f, 8.45f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.2f, -0.9f)
                lineToRelative(-2.4f, 3.2f)
                close()
            }
        }.build()

        return _LetterXCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LetterXCircle: ImageVector? = null
